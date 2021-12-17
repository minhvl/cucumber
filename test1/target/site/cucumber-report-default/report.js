$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "test login",
  "description": "",
  "id": "test-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@purchase"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "login kiotviet",
  "description": "",
  "id": "test-login;login-kiotviet",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Input user \"\u003cuser\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Input password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click quan ly button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see dashboard \"\u003clink\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Quit browser",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "test-login;login-kiotviet;",
  "rows": [
    {
      "cells": [
        "user",
        "password",
        "link"
      ],
      "line": 13,
      "id": "test-login;login-kiotviet;;1"
    },
    {
      "cells": [
        "admin",
        "admin@123",
        "https://marketleminh.kiotviet.vn/man/#/DashBoard"
      ],
      "line": 14,
      "id": "test-login;login-kiotviet;;2"
    },
    {
      "cells": [
        "admin1",
        "admin@123",
        "https://marketleminh.kiotviet.vn/man/#/DashBoard"
      ],
      "line": 15,
      "id": "test-login;login-kiotviet;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "login kiotviet",
  "description": "",
  "id": "test-login;login-kiotviet;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@purchase"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Input user \"admin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Input password \"admin@123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click quan ly button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see dashboard \"https://marketleminh.kiotviet.vn/man/#/DashBoard\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Quit browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 15,
  "name": "login kiotviet",
  "description": "",
  "id": "test-login;login-kiotviet;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@purchase"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Input user \"admin1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Input password \"admin@123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click quan ly button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see dashboard \"https://marketleminh.kiotviet.vn/man/#/DashBoard\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Quit browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});