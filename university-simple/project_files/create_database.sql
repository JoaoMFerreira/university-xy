-- ---------------------------------------------------------


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
-- ---------------------------------------------------------
CREATE SCHEMA UNIVERSITY_XY;
USE UNIVERSITY_XY;


-- CREATE TABLE "TBL_CURSO" --------------------------------
-- CREATE TABLE "TBL_CURSO" ------------------------------------
CREATE TABLE `TBL_CURSO` ( 
	`ID` Int( 10 ) AUTO_INCREMENT NOT NULL,
	`NOME` VarChar( 60 ) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL,
	PRIMARY KEY ( `ID` ) )
CHARACTER SET = latin1
COLLATE = latin1_swedish_ci
ENGINE = InnoDB
AUTO_INCREMENT = 3;
-- -------------------------------------------------------------
-- ---------------------------------------------------------


-- CREATE TABLE "TBL_ALUNO" --------------------------------
-- CREATE TABLE "TBL_ALUNO" ------------------------------------
CREATE TABLE `TBL_ALUNO` ( 
	`CPF` BigInt( 12 ) NOT NULL,
	`MATRICULA` VarChar( 20 ) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
	`NOME` VarChar( 60 ) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
	`CURSO_ID` Int( 10 ) NULL,
	PRIMARY KEY ( `CPF`, `MATRICULA` ) )
CHARACTER SET = latin1
COLLATE = latin1_swedish_ci
ENGINE = InnoDB;
-- -------------------------------------------------------------
-- ---------------------------------------------------------


-- Dump data of "TBL_CURSO" --------------------------------
INSERT INTO `TBL_CURSO`(`ID`,`NOME`) VALUES ( '1', 'SISTEMAS' );
INSERT INTO `TBL_CURSO`(`ID`,`NOME`) VALUES ( '2', 'IPC' );
-- ---------------------------------------------------------


-- Dump data of "TBL_ALUNO" --------------------------------
INSERT INTO `TBL_ALUNO`(`CPF`,`MATRICULA`,`NOME`,`CURSO_ID`) VALUES ( '6514615457', '100254', 'Alexandre', '1' );
-- ---------------------------------------------------------


-- CREATE INDEX "CURSO_ID" ---------------------------------
-- CREATE INDEX "CURSO_ID" -------------------------------------
CREATE INDEX `CURSO_ID` USING BTREE ON `TBL_ALUNO`( `CURSO_ID` );
-- -------------------------------------------------------------
-- ---------------------------------------------------------


-- CREATE LINK "TBL_ALUNO_ibfk_1" --------------------------
-- CREATE LINK "TBL_ALUNO_ibfk_1" ------------------------------
ALTER TABLE `TBL_ALUNO`
	ADD CONSTRAINT `TBL_ALUNO_ibfk_1` FOREIGN KEY ( `CURSO_ID` )
	REFERENCES `TBL_CURSO`( `ID` )
	ON DELETE Restrict
	ON UPDATE Restrict;
-- -------------------------------------------------------------
-- ---------------------------------------------------------


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
-- ---------------------------------------------------------

