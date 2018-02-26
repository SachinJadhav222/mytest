$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/Search.feature");
formatter.feature({
  "line": 2,
  "name": "Search Feature",
  "description": "AS user\r\nI wanto search",
  "id": "search-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.before({
  "duration": 1837992,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on Home Psge",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchSteps.iAmOnHomePsge()"
});
formatter.result({
  "duration": 199836650,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Search for London",
  "description": "",
  "id": "search-feature;search-for-london",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@rm"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I search for \"London\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I can see London  Information",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 14
    }
  ],
  "location": "SearchSteps.iSearchFor(String)"
});
formatter.result({
  "duration": 108952751,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.iCanSeeLondonInformation()"
});
formatter.result({
  "duration": 114085,
  "status": "passed"
});
formatter.write("Scenario Passed");
formatter.after({
  "duration": 322122,
  "status": "passed"
});
});