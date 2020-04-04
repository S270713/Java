

SELECT * FROM tablejaegers;

SELECT * FROM tablejaegers WHERE status = 'Active';

SELECT * FROM tablejaegers WHERE mark = 'Mark-1' OR mark = 'Mark-5';

SELECT * FROM tablejaegers ORDER BY mark DESC;

SELECT * FROM tablejaegers WHERE launch = (SELECT MIN(launch) FROM tablejaegers);

SELECT * FROM tablejaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM tablejaegers) OR kaijuKill = (SELECT MAX(kaijuKill) FROM tablejaegers);

SELECT AVG(weight) FROM tablejaegers;

UPDATE tablejaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Active';

SELECT * FROM tablejaegers;

DELETE FROM tablejaegers WHERE status = 'Destroyed';

SELECT * FROM tablejaegers;



