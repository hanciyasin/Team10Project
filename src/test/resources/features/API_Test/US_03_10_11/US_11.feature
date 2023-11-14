Feature: US11 Vice Dean Ders Progremi gorme ve silme
@US_11
  Scenario: Vice Dean Ders Programini gorur ve siler
    Given Lesson Program Get icin Url duzenlenir
    Then Lesson Program Get request icin payload olusturulur "FRIDAY" , 15 , 1932 ,"12:00","13:00"
    Then Lesson Program goruntulemek icin Get response gonderilir ve response alinir
    Then Lesson Program Delete icin Url duzenlenir
    When Lesson Program Delete request ile silinir