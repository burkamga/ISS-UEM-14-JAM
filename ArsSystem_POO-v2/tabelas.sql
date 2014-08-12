SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `ars` DEFAULT CHARACTER SET utf8 ;
USE `ars` ;

-- -----------------------------------------------------
-- Table `ars`.`vopessoa`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`vopessoa` ;

CREATE  TABLE IF NOT EXISTS `ars`.`vopessoa` (
  `idPessoa` INT NOT NULL AUTO_INCREMENT ,
  `nome` VARCHAR(45) NULL ,
  `rg` VARCHAR(45) NULL ,
  `cpf` VARCHAR(45) NULL ,
  `dataNascimento` DATE NULL ,
  `endereco` VARCHAR(45) NULL ,
  `telefone` VARCHAR(45) NULL ,
  `celular` VARCHAR(45) NULL ,
  `email` VARCHAR(45) NULL ,
  `tipo` INT NULL ,
  PRIMARY KEY (`idPessoa`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ars`.`voadm`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`voadm` ;

CREATE  TABLE IF NOT EXISTS `ars`.`voadm` (
  `idadm` INT NOT NULL ,
  `username` VARCHAR(45) NULL ,
  `senha` VARCHAR(45) NULL ,
  PRIMARY KEY (`idadm`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ars`.`vomedico`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`vomedico` ;

CREATE  TABLE IF NOT EXISTS `ars`.`vomedico` (
  `Pessoa_idPessoa` INT NOT NULL ,
  `numCRM` VARCHAR(45) NULL ,
  `especializacao` VARCHAR(45) NULL ,
  `usename` VARCHAR(45) NULL ,
  `senha` VARCHAR(45) NULL ,
  PRIMARY KEY (`Pessoa_idPessoa`) ,
  CONSTRAINT `fk_Medico_Pessoa`
    FOREIGN KEY (`Pessoa_idPessoa` )
    REFERENCES `ars`.`vopessoa` (`idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ars`.`vosecretaria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`vosecretaria` ;

CREATE  TABLE IF NOT EXISTS `ars`.`vosecretaria` (
  `Pessoa_idPessoa` INT NOT NULL ,
  `salario` INT NULL ,
  `username` VARCHAR(45) NULL ,
  `senha` VARCHAR(45) NULL ,
  PRIMARY KEY (`Pessoa_idPessoa`) ,
  CONSTRAINT `fk_Secretaria_Pessoa1`
    FOREIGN KEY (`Pessoa_idPessoa` )
    REFERENCES `ars`.`vopessoa` (`idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ars`.`vopaciente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`vopaciente` ;

CREATE  TABLE IF NOT EXISTS `ars`.`vopaciente` (
  `Pessoa_idPessoa` INT NOT NULL ,
  `tipoConvenio` VARCHAR(45) NULL ,
  PRIMARY KEY (`Pessoa_idPessoa`) ,
  CONSTRAINT `fk_Paciente_Pessoa1`
    FOREIGN KEY (`Pessoa_idPessoa` )
    REFERENCES `ars`.`vopessoa` (`idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ars`.`voconsultas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`voconsultas` ;

CREATE  TABLE IF NOT EXISTS `ars`.`voconsultas` (
  `voconsultasId` INT NOT NULL ,
  `Paciente_Pessoa_idPessoa` INT NOT NULL ,
  `Medico_Pessoa_idPessoa` INT NOT NULL ,
  `ConsultaAtiva` TINYINT(1) NULL ,
  `daHora` DATE NULL ,
  INDEX `fk_Consultas_Medico1_idx` (`Medico_Pessoa_idPessoa` ASC) ,
  PRIMARY KEY (`voconsultasId`) ,
  CONSTRAINT `fk_Consultas_Paciente1`
    FOREIGN KEY (`Paciente_Pessoa_idPessoa` )
    REFERENCES `ars`.`vopaciente` (`Pessoa_idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Consultas_Medico1`
    FOREIGN KEY (`Medico_Pessoa_idPessoa` )
    REFERENCES `ars`.`vomedico` (`Pessoa_idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ars`.`voprontuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`voprontuario` ;

CREATE  TABLE IF NOT EXISTS `ars`.`voprontuario` (
  `idProntuario` INT NOT NULL ,
  `Paciente_Pessoa_idPessoa` INT NOT NULL ,
  `Consultas_Paciente_Pessoa_idPessoa` INT NOT NULL ,
  `sintomas` VARCHAR(300) NULL ,
  `diagnostico` VARCHAR(100) NULL ,
  `tratamento` VARCHAR(45) NULL ,
  PRIMARY KEY (`idProntuario`) ,
  INDEX `fk_Prontuario_Paciente1_idx` (`Paciente_Pessoa_idPessoa` ASC) ,
  INDEX `fk_Prontuario_Consultas1_idx` (`Consultas_Paciente_Pessoa_idPessoa` ASC) ,
  CONSTRAINT `fk_Prontuario_Paciente1`
    FOREIGN KEY (`Paciente_Pessoa_idPessoa` )
    REFERENCES `ars`.`vopaciente` (`Pessoa_idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Prontuario_Consultas1`
    FOREIGN KEY (`Consultas_Paciente_Pessoa_idPessoa` )
    REFERENCES `ars`.`voconsultas` (`Paciente_Pessoa_idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ars`.`voprontuarioext`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`voprontuarioext` ;

CREATE  TABLE IF NOT EXISTS `ars`.`voprontuarioext` (
  `Paciente_Pessoa_idPessoa` INT NOT NULL ,
  `bebe` TINYINT(1) NULL ,
  `fuma` TINYINT(1) NULL ,
  `colesterol` TINYINT(1) NULL ,
  `diabetes` TINYINT(1) NULL ,
  `doencasCardiacas` TINYINT(1) NULL ,
  `cirurgias` VARCHAR(100) NULL ,
  `alergias` VARCHAR(140) NULL ,
  PRIMARY KEY (`Paciente_Pessoa_idPessoa`) ,
  CONSTRAINT `fk_voprontuarioext_Paciente1`
    FOREIGN KEY (`Paciente_Pessoa_idPessoa` )
    REFERENCES `ars`.`vopaciente` (`Pessoa_idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ars`.`vodataconsulta`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`vodataconsulta` ;

CREATE  TABLE IF NOT EXISTS `ars`.`vodataconsulta` (
  `Data` VARCHAR(45) NULL ,
  `a` INT NULL ,
  `b` INT NULL ,
  `c` INT NULL ,
  `d` INT NULL ,
  `e` INT NULL ,
  `f` INT NULL ,
  `g` INT NULL ,
  `h` INT NULL ,
  `i` INT NULL ,
  `j` INT NULL ,
  `k` INT NULL ,
  `l` INT NULL ,
  `m` INT NULL ,
  `n` INT NULL ,
  `o` INT NULL ,
  `p` INT NULL ,
  `q` INT NULL ,
  `r` INT NULL ,
  `s` INT NULL ,
  `t` INT NULL ,
  PRIMARY KEY (`Data`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ars`.`voadm`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`voadm` ;

CREATE  TABLE IF NOT EXISTS `ars`.`voadm` (
  `idadm` INT(11) NOT NULL ,
  `username` VARCHAR(45) NULL DEFAULT NULL ,
  `senha` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`idadm`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `ars`.`vopessoa`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`vopessoa` ;

CREATE  TABLE IF NOT EXISTS `ars`.`vopessoa` (
  `idPessoa` INT(11) NOT NULL AUTO_INCREMENT ,
  `nome` VARCHAR(45) NULL DEFAULT NULL ,
  `rg` VARCHAR(45) NULL DEFAULT NULL ,
  `cpf` VARCHAR(45) NULL DEFAULT NULL ,
  `dataNascimento` DATE NULL DEFAULT NULL ,
  `endereco` VARCHAR(45) NULL DEFAULT NULL ,
  `telefone` VARCHAR(45) NULL DEFAULT NULL ,
  `celular` VARCHAR(45) NULL DEFAULT NULL ,
  `email` VARCHAR(45) NULL DEFAULT NULL ,
  `tipo` INT(11) NULL DEFAULT NULL ,
  PRIMARY KEY (`idPessoa`) )
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `ars`.`vomedico`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`vomedico` ;

CREATE  TABLE IF NOT EXISTS `ars`.`vomedico` (
  `Pessoa_idPessoa` INT(11) NOT NULL ,
  `numCRM` VARCHAR(45) NULL DEFAULT NULL ,
  `especializacao` VARCHAR(45) NULL DEFAULT NULL ,
  `usename` VARCHAR(45) NULL DEFAULT NULL ,
  `senha` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`Pessoa_idPessoa`) ,
  CONSTRAINT `fk_Medico_Pessoa`
    FOREIGN KEY (`Pessoa_idPessoa` )
    REFERENCES `ars`.`vopessoa` (`idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `ars`.`vopaciente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`vopaciente` ;

CREATE  TABLE IF NOT EXISTS `ars`.`vopaciente` (
  `Pessoa_idPessoa` INT(11) NOT NULL ,
  `tipoConvenio` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`Pessoa_idPessoa`) ,
  CONSTRAINT `fk_Paciente_Pessoa1`
    FOREIGN KEY (`Pessoa_idPessoa` )
    REFERENCES `ars`.`vopessoa` (`idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `ars_poo`.`vopacienteext`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`vopacienteext` ;

CREATE  TABLE IF NOT EXISTS `ars`.`vopacienteext` (
  `Paciente_Pessoa_idPessoa` INT(11) NOT NULL ,
  `bebe` TINYINT(1) NULL DEFAULT NULL ,
  `fuma` TINYINT(1) NULL DEFAULT NULL ,
  `colesterol` TINYINT(1) NULL DEFAULT NULL ,
  `diabetes` TINYINT(1) NULL DEFAULT NULL ,
  `doencasCardiacas` TINYINT(1) NULL DEFAULT NULL ,
  `cirurgias` VARCHAR(100) NULL DEFAULT NULL ,
  `alergias` VARCHAR(140) NULL DEFAULT NULL ,
  PRIMARY KEY (`Paciente_Pessoa_idPessoa`) ,
  CONSTRAINT `fk_VOPacienteExt_Paciente1`
    FOREIGN KEY (`Paciente_Pessoa_idPessoa` )
    REFERENCES `ars`.`vopaciente` (`Pessoa_idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `ars`.`voconsultas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`voconsultas` ;

CREATE  TABLE IF NOT EXISTS `ars`.`voconsultas` (
  `voconsultasId` INT(11) NOT NULL AUTO_INCREMENT ,
  `Paciente_Pessoa_idPessoa` INT(11) NOT NULL ,
  `Medico_Pessoa_idPessoa` INT(11) NOT NULL ,
  `tipoConsulta` INT(11) NULL DEFAULT NULL ,
  `data` VARCHAR(45) NULL DEFAULT NULL ,
  `hora` INT(11) NULL DEFAULT NULL ,
  PRIMARY KEY (`voconsultasId`) ,
  INDEX `fk_Consultas_Medico1_idx` (`Medico_Pessoa_idPessoa` ASC) ,
  INDEX `fk_Consultas_Paciente1` (`Paciente_Pessoa_idPessoa` ASC) ,
  CONSTRAINT `fk_Consultas_Medico1`
    FOREIGN KEY (`Medico_Pessoa_idPessoa` )
    REFERENCES `ars`.`vomedico` (`Pessoa_idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Consultas_Paciente1`
    FOREIGN KEY (`Paciente_Pessoa_idPessoa` )
    REFERENCES `ars`.`vopaciente` (`Pessoa_idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `ars`.`vodataconsulta`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`vodataconsulta` ;

CREATE  TABLE IF NOT EXISTS `ars`.`vodataconsulta` (
  `Data` VARCHAR(45) NOT NULL DEFAULT '0' ,
  `a` INT(11) NULL DEFAULT NULL ,
  `b` INT(11) NULL DEFAULT NULL ,
  `c` INT(11) NULL DEFAULT NULL ,
  `d` INT(11) NULL DEFAULT NULL ,
  `e` INT(11) NULL DEFAULT NULL ,
  `f` INT(11) NULL DEFAULT NULL ,
  `g` INT(11) NULL DEFAULT NULL ,
  `h` INT(11) NULL DEFAULT NULL ,
  `i` INT(11) NULL DEFAULT NULL ,
  `j` INT(11) NULL DEFAULT NULL ,
  `k` INT(11) NULL DEFAULT NULL ,
  `l` INT(11) NULL DEFAULT NULL ,
  `m` INT(11) NULL DEFAULT NULL ,
  `n` INT(11) NULL DEFAULT NULL ,
  `o` INT(11) NULL DEFAULT NULL ,
  `p` INT(11) NULL DEFAULT NULL ,
  `q` INT(11) NULL DEFAULT NULL ,
  `r` INT(11) NULL DEFAULT NULL ,
  `s` INT(11) NULL DEFAULT NULL ,
  `t` INT(11) NULL DEFAULT NULL ,
  PRIMARY KEY (`Data`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `ars`.`voprontuarioext`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`voprontuarioext` ;

CREATE  TABLE IF NOT EXISTS `ars`.`voprontuarioext` (
  `Paciente_Pessoa_idPessoa` INT(11) NOT NULL ,
  `bebe` TINYINT(1) NULL DEFAULT NULL ,
  `fuma` TINYINT(1) NULL DEFAULT NULL ,
  `colesterol` TINYINT(1) NULL DEFAULT NULL ,
  `diabetes` TINYINT(1) NULL DEFAULT NULL ,
  `doencasCardiacas` TINYINT(1) NULL DEFAULT NULL ,
  `cirurgias` VARCHAR(100) NULL DEFAULT NULL ,
  `alergias` VARCHAR(140) NULL DEFAULT NULL ,
  PRIMARY KEY (`Paciente_Pessoa_idPessoa`) ,
  CONSTRAINT `fk_voprontuarioext_Paciente1`
    FOREIGN KEY (`Paciente_Pessoa_idPessoa` )
    REFERENCES `ars`.`vopaciente` (`Pessoa_idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `ars`.`voprontuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`voprontuario` ;

CREATE  TABLE IF NOT EXISTS `ars`.`voprontuario` (
  `idProntuario` INT(11) NOT NULL AUTO_INCREMENT ,
  `Paciente_Pessoa_idPessoa` INT(11) NOT NULL ,
  `sintomas` VARCHAR(300) NULL DEFAULT NULL ,
  `diagnostico` VARCHAR(100) NULL DEFAULT NULL ,
  `tratamento` VARCHAR(45) NULL DEFAULT NULL ,
  `idconsulta` INT(11) NULL DEFAULT NULL ,
  `voprontuariocol` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`idProntuario`) ,
  INDEX `fk_Prontuario_Paciente1_idx` (`Paciente_Pessoa_idPessoa` ASC) ,
  CONSTRAINT `fk_Prontuario_Paciente1`
    FOREIGN KEY (`Paciente_Pessoa_idPessoa` )
    REFERENCES `ars`.`vopaciente` (`Pessoa_idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `ars`.`vosecretaria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ars`.`vosecretaria` ;

CREATE  TABLE IF NOT EXISTS `ars`.`vosecretaria` (
  `Pessoa_idPessoa` INT(11) NOT NULL ,
  `salario` INT(11) NULL DEFAULT NULL ,
  `username` VARCHAR(45) NULL DEFAULT NULL ,
  `senha` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`Pessoa_idPessoa`) ,
  CONSTRAINT `fk_Secretaria_Pessoa1`
    FOREIGN KEY (`Pessoa_idPessoa` )
    REFERENCES `ars`.`vopessoa` (`idPessoa` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

USE `ars` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
