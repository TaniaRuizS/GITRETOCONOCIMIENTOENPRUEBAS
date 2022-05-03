#language:en
# Autor: Tania Ruiz Sanchez
@stories
Feature: consultarVuelos

  As a user I want to check flights on the latam page to validate the different flights available

  @scenario1
  Scenario Outline: check flights
    Given Latam user
    When check round trip flights
      | origen   | destino   |
      | <origen> | <destino> |

    Then validate the different flights available


    Examples:
      | origen                   | destino                             |
      | Medellín, MDE - Colombia | Pereira, PEI - Colombia             |
      | Armenia, AXM - Colombia  | Cartagena de Indias, CTG - Colombia |

