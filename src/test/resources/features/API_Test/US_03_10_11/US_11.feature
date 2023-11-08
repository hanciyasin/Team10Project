Feature: US11 Vice Dean Ders Progremi gorme, guncelleme ve silme

  Scenario: Vice Dean Ders Programini gorur, gunceller ve siler
    Given Vice Dean Ders Programini Get request ile goruntuler
    Given Vice Dean Ders Put request ile Ders Programi uzerinde guncelleme yapar
    Then Vice Delete request ile Ders Progamini siler