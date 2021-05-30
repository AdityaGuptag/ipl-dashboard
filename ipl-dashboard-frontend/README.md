# Getting Started with Create React App

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

## Available Scripts

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

The page will reload if you make edits.\
You will also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `npm run build`

Builds the app for production to the `build` folder.\
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.\
Your app is ready to be deployed!

Apart from this default behaviour, an `xcopy` command is added to copy all the files and folders created inside 
react app's build folder into /resources/public folder of spring backend service

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

## Important Note about HashRouter used in place of BrowserRouter

### Problem with BrowerRouter
When we reload the spring backend application inside some path defined in react app, then it will show White label error page
But when we just load localhost:8080/ (where spring app is running) and then it will load react app and we can navigate
through.

### HashRouter to the rescue
HashRouter puts a hash in the URL i.e. localhost:8080/#/ and it serves the purpose.  