Feature: US10 Vice Dean ders programi olusturma API Test

  Scenario: TC01 Vice Dean basarili bir sekilde ders programi olusturabilmeli.
    Given
    And Gonderilecek ders programi bilgileri hazirlanir.
    When Ders programi olusturmak icin POST request gonderilir.
    Then Olusturulan ders programi bilgileri dogrulanir.
