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
    And "email" öğesine "kryı@afgsn.com" yazarsam
    And "password" öğesine "1234abnABC" yazarsam
    And "checkbox" öğesine tıklarsam
    And 5 saniye beklersem
    And "createAccount" öğesine tıklarsam
    And 15 saniye beklersem
    Then "Total Amount : AU$19.99" metnini görürüm
    And "checkbox2" öğesine tıklarsam
    And "payNow" öğesine tıklarsam
    And 10 saniye beklersem
    #Then "1.00 AUD" metnini görürüm
    When "carHoldersNAme" öğesine "test test" yazarsam
    And "cardNumber" öğesine "123412341234" yazarsam
    And "mount" selectbox öğesine  "10" değeri atarsam
    And "year" selectbox öğesine  "2023" değeri atarsam
    And "cvv" öğesine "123" yazarsam
    And "payment" öğesine tıklarsam