@dbCLM
Feature: verify the dbCLM API call response.

@dbCLM_get
Scenario : Verify the get end point.
When I make a call to API with querie parameter Order.
  And check the response.
  And the response <statuscode>.