Feature: ServicesAplication

  @Test
  Scenario: Get Post Gervisi
    Given "getPost" servisini çalıştırırsam
    And "getUser" servisini çalıştırırsam
    And "getComment" servisini çalıştırırsam
    #post metodunu tamamlayamadım
    And "fırat, ay, örnek@gmail.com, 0599 999 99 99" parametreler ile "postUser" servisini çalıştırırsam
    And "3, foto ışığı hakkında , çok beğendim ama karanlık çıkmış" parametreler ile "PostComent" servisini çalıştırırsam