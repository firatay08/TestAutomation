Feature: TestAplication

  @Test
  Scenario: Bein Sports Connect Australia Abonelik Test Durumu
    Given taryıcıyı açarsam
    When "https://connect-au.beinsports.com/en" adresine gidersem
    And 1 saniye beklersem
    And "subscribe" öğesine tıklarsam
    And 2 saniye beklersem
    And "subscribe2" öğesine tıklarsam
    And 2 saniye beklersem
    And "firstName" öğesine "fırat" yazarsam
    And "lastName" öğesine "AY" yazarsam
    And "email" öğesine rasgele mail oluşturup yazarsam
    And "password" öğesine "1234abnABC" yazarsam
    And "checkbox" öğesine tıklarsam
    And 5 saniye beklersem
    And "createAccount" öğesine tıklarsam
    And 15 saniye beklersem
    Then "Total Amount : AU$19.99" metnini görürüm
    And "checkbox2" öğesine tıklarsam
    And "payNow" öğesine tıklarsam
    And 10 saniye beklersem
    When "carHoldersNAme" öğesine "test test" yazarsam
    And "cardNumber" öğesine "123412341234" yazarsam
    #And "mount" öğesine tıklarsam
    #And enter basarsam
    And "TAB" tuşuna basarsam
    And "DOWN" tuşuna basarsam
    #And "mount" selectbox öğesine  "10" değeri atarsam
    And "year" selectbox öğesine  "2023" değeri atarsam
    And "cvv" öğesine "123" yazarsam
    And "payment" öğesine tıklarsam
    And tarayıcıyı kapatırım