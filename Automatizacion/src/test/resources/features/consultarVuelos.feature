#language:en
# Autor: Tania Ruiz Sanchez
@stories
Feature: consultarVuelos

  As a user I want to check flights on the latam page to validate the different flights available

  @scenario1
  Scenario Outline: check flights
    Given Latam user
    When check round trip flights
      | origen   | destino   | fechaida   | fechavuelta   | clase   |
      | <origen> | <destino> | <fechaida> | <fechavuelta> | <clase> |

    Then validate the different flights available


    Examples:
      | origen                  | destino                             | fechaida      | fechavuelta    | clase   |
      | Pereira, PEI - Colombia | Cartagena de Indias, CTG - Colombia | dom. 5 de jun | dom. 12 de jun | Economy |

