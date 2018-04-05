How to make a release
=====================

* Run the following command to deploy the artifact:

  ```
  mvn release:clean release:prepare release:perform
  ```

* create a new release tag on github (`vX.Y.X`, with `X.Y.Z` taken from 
  `pom.xml`), add some release notes and upload the `-bin.zip`

* push out all changes
