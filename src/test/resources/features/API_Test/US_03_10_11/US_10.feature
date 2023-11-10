Feature: US10 Vice Dean ders programi olusturma API Test

  Scenario: TC01 Vice Dean basarili bir sekilde ders programi olusturabilmeli.
    Given Lesson Program save icin URL duzenlenir.
    And Gonderilecek ders programi bilgileri icin payload olusturulur.
    When Lesson Program save icin Post request gonderilir ve response alinir.
    Then Lesson Program Post sonrasi gelen response dogrulanir