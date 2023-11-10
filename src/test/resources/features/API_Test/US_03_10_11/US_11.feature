Feature: US11 Vice Dean Ders Progremi gorme, guncelleme ve silme

  Scenario: Vice Dean Ders Programini gorur ve siler
    Given Lesson Program Get icin Url duzenlenir.
    Then Lesson Program Get request icin payload olusturulur.
    Then Lesson Program goruntulemek icin Get response gonderilir ve response alinir.
    Then Lesson Program Get icin gelen response dogrulanir.
    Then Lesson Program Delete icin Url duzenlenir.
    When Lesson Program Delete request ile silinir.