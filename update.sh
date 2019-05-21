#! /bin/bash
source ./.secrets
REPO="equinor/neqsimweb"
echo "Authenticating with token: $GITHUB_TOKEN"
LATEST_ASSET=$(curl --silent -H "Authorization: token $GITHUB_TOKEN" https://api.github.com/repos/$REPO/releases/latest |
            jq .assets[0].id)
echo "Downloading https://api.github.com/repos/$REPO/releases/assets/$LATEST_ASSET"
curl -L --header "Authorization: token $GITHUB_TOKEN" --header "Accept: application/octet-stream" https://api.github.com/repos/$REPO/releases/assets/$LATEST_ASSET -o NeqSimServer.war

docker-compose up --detach --build
exit 0