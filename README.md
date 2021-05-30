React app is build using the command 'npm run build'

When the react app build is complete it would automatically add all the contents of build directory in frontend 
service into /resources/public directory of backend service

Now whatever goes in resources/public directory of spring app, that is displayed at 'localhost:8080/' 
i.e. at the root level URL of spring app

Hence whenever, we load localhost:8080/ it will load the react app for us there 