USE UNIVERSITY_XY;

DELIMITER $$
CREATE PROCEDURE cursoByAluno ()
BEGIN
	SELECT C.NOME as curso, A.NOME as aluno FROM tbl_curso C 
    INNER JOIN tbl_aluno A on A.CURSO_ID = C.ID;
END $$
DELIMITER ;
