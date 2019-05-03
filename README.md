# NeqSim Web
NeqSim Web is a web inerface for the NeqSim simulation tool. NeqSim (Non-Equilibrium Simulator) is a Java library for estimation of fluid behavior and process design for oil and gas production. The basis for NeqSim is a library of fundamental mathematical models related to phase behavior and physical properties of oil and gas.  NeqSim is easilly extended with new method. 

## Releases
NeqSim Web is [distributed](https://github.com/equinor/neqsimweb/releases) as a war file, that can run on a java application server. The application uses a SQL-database as bases for storing information.

## Getting Started
See the [NeqSim Wiki](https://wiki.equinor.com/wiki/index.php/NeqSim) for how to use the NeqSim Web interface.

### Prerequisites
NeqSim Web source code can be compiled with JDK8+ and is dependent on a number of third part java libraries. All libraries are included in the distributed war file. The ..

## Deployment (Work-In-Progress)
The NeqSimWeb application is deployed as a container. You can build this container with the latest version file by using the Dockerfile found in this repo.  
There is also a Docker-compose file that can be used to deploy the web-server and the required database together.  
Secrets are read from the ".secrets" file. Keep this out of the git repository. You can use the "secrets.template" file as guidance.

Before you can build the container image, you need two files.  

* The application compiled as a java web archive (.war) in the repo root.
* The latest `mysql-connector-java-X.X.XX.jar`in ./lib/

You can now deploy the application;  
`docker-compose up --build`

The database will be empty the first time you start the containers. To load a database dump into the database, you can do something like this, if the dump is mounted into the container;  
```
docker exec -it neqsim-database sh
mysql -u root -p neqsimdatabase < /temporary/databaseDump.sql
```

## Versioning
NeqSim use [SemVer](https://semver.org/) for versioning.

## Licence
NeqSim Web is distributed under the [Apache-2.0](https://github.com/equinor/neqsimsource/blob/master/LICENSE) licence.
