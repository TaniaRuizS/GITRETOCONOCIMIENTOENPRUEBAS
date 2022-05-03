#language:en
# Autor: Tania Ruiz Sanchez
@stories
Feature: consultarVuelos

  As a user I want to check flights on the latam page to validate the different flights available

  @scenario1
  Scenario Outline: check flights
    Given Latam user
    When check round trip flights
      | origen   |
      | <origen> |
    Then validate the different flights available


    Examples:
      | origen  |
      | Pereira |


