CREATE TABLE PRODUTO (
	cd_produto INT NOT NULL,
	nome_produto varchar(50),
	data_cadastro date,
	CONSTRAINT PK_PRODUTO PRIMARY KEY (cd_produto)
);

INSERT INTO PRODUTO(cd_produto, nome_produto, data_cadastro) VALUES (1, 'Sucrilhos', '2000-04-02');
INSERT INTO PRODUTO(cd_produto, nome_produto, data_cadastro) VALUES (2, 'Toalha de piquenique', '2010-10-22');
INSERT INTO PRODUTO(cd_produto, nome_produto, data_cadastro) VALUES (3, 'Tapaué', '2001-10-10');
INSERT INTO PRODUTO(cd_produto, nome_produto, data_cadastro) VALUES (4, 'Chinelo de arrasto', '2021-01-01');
INSERT INTO PRODUTO(cd_produto, nome_produto, data_cadastro) VALUES (5, 'Leite de morcego', '2020-05-14');
INSERT INTO PRODUTO(cd_produto, nome_produto, data_cadastro) VALUES (6, 'João Andante', '2019-10-15');