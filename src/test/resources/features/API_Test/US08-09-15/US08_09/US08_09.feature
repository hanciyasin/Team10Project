@API08_09
  Feature: Leeson Controller

    Scenario: US08 Vice Dean Ders ekleme
      Given lesson save icin url duzenlenir
      And lesson save icin payload duzenlenir
      When lesson save icin POST Request gonderilir Response alinir
      Then Status kodun 200 oldugu dogrulanır
      And lesson save icin gelen Response dogrulanir

    Scenario: US09 TC01 lesson list getAll
      Given lessons listesi alinir
      Then Status kodun 200 oldugu dogrulanır

    Scenario: US09 TC02 getAll Lesson By LessonId
      Given lesson id ile ders kontrol edilir
      Then Status kodun 200 oldugu dogrulanır

    Scenario: US09 TC03 get Lesson By Name
      Given lesson name ile ders kontrol edilir
      Then Status kodun 200 oldugu dogrulanır


    Scenario: US09 Vice Dean Ders Silme
      Given lesson delete icin url duzenlenir
      Then Kayitli lesson silinir
      And lesson silindigi dogrulanır
      Then Status kodun 200 oldugu dogrulanır






