mysql> select count(*)from personel;
+----------+
| count(*) |
+----------+
|        9 |
+----------+

mysql> select tittle,count(*)from personel group by tittle;
+-------------+----------+
| tittle      | count(*) |
+-------------+----------+
| supervisor  |        1 |
| stock clerk |        2 |
| programmer  |        2 |
| secretary   |        2 |
| president   |        1 |
| accountant  |        1 |
+-------------+----------+


mysql> select count(*)total ,dept_id from personel group by dept_id;
+-------+---------+
| total | dept_id |
+-------+---------+
|     3 |      14 |
|     6 |       7 |
+-------+---------+



mysql> select dept_id,tittle,count(*)from personel group by dept_id,tittle order by dept_id;
+---------+-------------+----------+
| dept_id | tittle      | count(*) |
+---------+-------------+----------+
|       7 | accountant  |        1 |
|       7 | programmer  |        2 |
|       7 | secretary   |        1 |
|       7 | stock clerk |        2 |
|      14 | president   |        1 |
|      14 | secretary   |        1 |
|      14 | supervisor  |        1 |
+---------+-------------+----------+



mysql> select tittle,max(salary),min(salary),avg(salary)from personel group by tittle;
+-------------+-------------+-------------+-------------+
| tittle      | max(salary) | min(salary) | avg(salary) |
+-------------+-------------+-------------+-------------+
| supervisor  |       38000 |       38000 |  38000.0000 |
| stock clerk |       29000 |       28000 |  28500.0000 |
| programmer  |       48000 |       41000 |  44500.0000 |
| secretary   |       33000 |       32000 |  32500.0000 |
| president   |       78000 |       78000 |  78000.0000 |
| accountant  |       40000 |       40000 |  40000.0000 |
+-------------+-------------+-------------+-------------+

mysql> select tittle,max(salary),min(salary),avg(salary)from personel group by dept_id;
+-------------+-------------+-------------+-------------+
| tittle      | max(salary) | min(salary) | avg(salary) |
+-------------+-------------+-------------+-------------+
| supervisor  |       78000 |       32000 |  49333.3333 |
| stock clerk |       48000 |       28000 |  36500.0000 |
+-------------+-------------+-------------+-------------+

mysql> select tittle,salary,count(*),avg(salary)from personel where dept_id=7 group by tittle having count(*)>1;
+-------------+--------+----------+-------------+
| tittle      | salary | count(*) | avg(salary) |
+-------------+--------+----------+-------------+
| stock clerk |  28000 |        2 |  28500.0000 |
| programmer  |  41000 |        2 |  44500.0000 |
+-------------+--------+----------+-------------+