Feature: LoginAplication

  # Login adımında sistem beni robot olarak algılayıp blockluyor.
  # O yüzden login adımından sonra 20 saniye bekleme komutu verdim blocklanırsam manuel olarak giriş yapıp sistemin kalan adımları uygulamasını bekliyorum

  @Test
  Scenario: Doğru kullanıcı adı ve şifre ile giriş
    Given taryıcıyı açarsam
    When "https://www.n11.com" adresine gidersem
    And "n11.com - Alışverişin Uğurlu Adresi" sayfasının açıldığını görürüm
    And "//div[@class='btnHolder']" öğesine tıklarsam
    And "Giriş Yap" metnine tıklarsam
    And kullanıcı bilgilerini doldurursam
    And 20 saniye beklersem
    And enter basarsam
    And "firat ay" metnini görürüm
    And "//input[@id='searchData']" öğesini temizlersem
    And "//input[@id='searchData']" öğesine "bilgisayar" yazarsam
    And "//a[@class='searchBtn']" öğesine tıklarsam
    And 2 saniye beklersem
    And "//div[@class='pagination']/a[2]" öğesine tıklarsam
    And 2 saniye beklersem
    And "Bilgisayar - n11.com - 2" sayfasının açıldığını görürüm
    And rasgele ürün seç
    And sepete ekle ve kontrol et
    And "(//span[text()='+'])[1]" öğesine tıklarsam
    And 1 saniye beklersem
    Then "Toplam 2 ürün" metnini görürüm
    And "//span[@title='Sil']" öğesine tıklarsam
    And 1 saniye beklersem
    Then "Sepetiniz Boş" metnini görürüm
    And tarayıcıyı kapatırım

