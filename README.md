# Commands to run for the first time
1. Inside the ipl-dashboard-frontend directory, run `npm install`
2. Run `npm run build` inside the same path 
3. Follow the instructions in .env file in frontend service directory
4. Start the spring service, and at the root URL, react app will load

## General Notes
React app is build using the command 'npm run build'

When the react app build is complete it would automatically add all the contents of build directory in frontend 
service into /resources/public directory of backend service

Now whatever goes in resources/public directory of spring app, that is displayed at 'localhost:8080/' 
i.e. at the root level URL of spring app

Hence whenever, we load localhost:8080/ it will load the react app for us there 