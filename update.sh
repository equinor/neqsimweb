#! /bin/bash
REPO="equinor/neqsimweb"
LATEST_ASSET=$(curl --silent https://api.github.com/repos/$REPO/releases/latest |
            jq .assets[0].id)
echo "Downloading https://api.github.com/repos/$REPO/releases/assets/$LATEST_ASSET"
curl -L --header "Accept: application/octet-stream" https://api.github.com/repos/$REPO/releases/assets/$LATEST_ASSET -o NeqSimServer.war

docker-compose up --detach --build
exit 0
