$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Features/Add Tarrif Plan.feature");
formatter.feature({
  "name": "Add Customer",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Use is in the Add Customer Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.use_is_in_the_Add_tarrif_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Customer page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.use_is_in_the_Add_Customer_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Tarrif PLan",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "Fill the detailse",
  "rows": [
    {
      "cells": [
        "fName",
        "Rajitha"
      ]
    },
    {
      "cells": [
        "lName",
        "Kataru"
      ]
    },
    {
      "cells": [
        "email",
        "rajithak@gmail.com"
      ]
    },
    {
      "cells": [
        "Address",
        "nellore"
      ]
    },
    {
      "cells": [
        "Phno",
        "7338979844"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Steps.fill_the_detailse(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the successfull message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.validate_the_successfull_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});