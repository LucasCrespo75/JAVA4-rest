drop table CLIENTE;
CREATE TABLE CLIENTE (
CPF_ID VARCHAR(11) PRIMARY KEY,
NOME VARCHAR(100),
TELEFONE FLOAT,
EMAIL VARCHAR(100)
);

DROP TABLE VEICULO;
CREATE TABLE veiculo (
ID_PLACA VARCHAR(100) PRIMARY KEY,
MODELO VARCHAR(100),
FABRICANTE VARCHAR(100),
TIPO VARCHAR(100),
ANO DATE,
COR VARCHAR(100),
ID_CLIENTE VARCHAR(11)
);

DROP TABLE FUNCIONARIO;
CREATE TABLE FUNCIONARIO (
NOME VARCHAR(100),
ID_CODIGO INT PRIMARY KEY,
SENHA VARCHAR(100),
TELEFONE FLOAT,
EMAIL VARCHAR(100)
);

drop table ORDEM_SERVICO;
CREATE TABLE ORDEM_SERVICO(
ID_ORDEMSERVICO INT PRIMARY KEY,
DATA_ENTRADA DATE,
DATA_SERVICO_INICIO DATE,
DATA_SERVICO_FIM DATE,
VALOR_TOTAL FLOAT,    
VALOR_MAOdeOBRA FLOAT,
QUILOMETRAGEM INT,
OBS VARCHAR(100),
STATUS VARCHAR(100),--ABERTO, FECHADO OU CANCELADO
VALIDADE DATE,
FUNCIONARIO INT,--FK
VEICULO VARCHAR(11)--FK


);
DROP TABLE MATERIAL;
CREATE TABLE MATERIAL (
ID_MATERIAL INT PRIMARY KEY,
DESCRICAO VARCHAR(100),
CODIGO INT,
FABRICANTE VARCHAR(100),
CLASSIFICACAO VARCHAR(100), --el�trica, mec�nica e seguran�a
VALOR_UNITARIO FLOAT
);

DROP TABLE ITEMSERVICO;
CREATE TABLE ITEMSERVICO(
ID_ITEMSERVICO INT PRIMARY KEY,
ID_MATERIAL INT,--(FK)
ID_ORDEMSERVICO INT,--(FK)
QTD INT
 
);

ALTER TABLE VEICULO ADD FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE(CPF_ID);

ALTER TABLE ITEMSERVICO ADD FOREIGN KEY (ID_MATERIAL) REFERENCES MATERIAL(ID_MATERIAL);
ALTER TABLE ITEMSERVICO ADD FOREIGN KEY (ID_ORDEMSERVICO) REFERENCES ORDEM_SERVICO(ID_ORDEMSERVICO);

ALTER TABLE ORDEM_SERVICO ADD FOREIGN KEY (VEICULO) REFERENCES VEICULO(ID_PLACA);
ALTER TABLE ORDEM_SERVICO ADD FOREIGN KEY (FUNCIONARIO) REFERENCES FUNCIONARIO(ID_CODIGO);

CREATE SEQUENCE S_ORDEMSERVICO
  INCREMENT BY 1 START WITH 1 NOCACHE NOCYCLE;
  
  CREATE SEQUENCE S_MATERIAL
  INCREMENT BY 1 START WITH 1 NOCACHE NOCYCLE;
  
  CREATE SEQUENCE S_ITEMSERVICO
  INCREMENT BY 1 START WITH 1 NOCACHE NOCYCLE;

