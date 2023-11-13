@US-25-DB
Feature:US25 Admin ogrenci olusturabilmeli.

  Scenario Outline: TC01 Olusan Student'i doğrula (DataBase)
    Given "<id>" ile student al
    Then resultSet bodyi dogrula: id="<id>",birthDay="<birth_day>",birthPlace="<birth_place>",gender="<gender>", name="<name>", phoneNumber="<phoneNumber>",  ssn="<ssn>", surname="<surname>", username="<username>",email "<email>",fatherName "<fatherName>",motherName  "<motherName>",advisorTeacherId "<advisorTeacherId>"
    Examples:
      | id   | birth_day  | birth_place    | gender | name | phoneNumber  | ssn         | surname | username         | email                     | fatherName | motherName | advisorTeacherId |
      | 2165 | 1910-01-15 | West Arronland | 0      | Alec | 544-687-1289 | 431-54-7480 | Cletus  | AsuncionThaddeus | elease.nikolaus@gmail.com | Dallas     | Aleisha    | 1250             |

