CREATE DATABASE ShopWheels;


USE ShopWheels;


CREATE TABLE produto(
    pro_id int NOT NULL AUTO_INCREMENT,
    pro_nome varchar(50) NOT NULL,
    pro_categoria varchar(50) NOT NULL,
    pro_descricao varchar(250) NOT NULL,
    pro_valor double NOT NULL,
    pro_qtd_est int NOT NULL,
    PRIMARY KEY (pro_id)
);


CREATE TABLE cliente(
    cli_id int NOT NULL AUTO_INCREMENT,
    cli_nome varchar(100) NOT NULL,
    PRIMARY KEY (cli_id)
);


CREATE TABLE funcionario(
    fun_id int NOT NULL AUTO_INCREMENT,
    fun_nome varchar(100) NOT NULL,
    fun_data_nasc date NOT NULL,
    fun_cargo varchar(20) NOT NULL,
    fun_data_adm date NOT NULL,
    fun_ctps varchar(20) NOT NULL,
    fun_logradouro varchar(200) NOT NULL,
    fun_bairro varchar(50) NOT NULL,
    fun_cidade varchar(100) NOT NULL,
    fun_cep varchar(9) NOT NULL,
    fun_num_resid varchar(10) NOT NULL,
    PRIMARY KEY (fun_id)
);


CREATE TABLE carro(
    car_id int NOT NULL AUTO_INCREMENT,
    car_modelo varchar(50) NOT NULL,
    car_marca varchar(50) NOT NULL,
    car_cor varchar(10) NOT NULL,
    car_placa varchar(8) NOT NULL,
    car_fk_cliente int NOT NULL, 
    PRIMARY KEY (car_id),
    FOREIGN KEY (car_fk_cliente) REFERENCES cliente (cli_id)
);


CREATE TABLE login(
    log_id int NOT NULL AUTO_INCREMENT,
    log_login varchar(50) NOT NULL,
    log_senha varchar(8) NOT NULL,
    log_fk_funcionario int NOT NULL,
    PRIMARY KEY (log_id),
    FOREIGN KEY (log_fk_funcionario) REFERENCES funcionario (fun_id)
);


CREATE TABLE telefone(
    tel_id int NOT NULL AUTO_INCREMENT,
    tel_ddd varchar(2) NOT NULL,
    tel_numero varchar(9) NOT NULL,
    tel_fk_cliente int,
    PRIMARY KEY (tel_id),
    FOREIGN KEY (tel_fk_cliente) REFERENCES cliente (cli_id)
);


CREATE TABLE venda(
   ven_id int NOT NULL AUTO_INCREMENT,
   ven_data date NOT NULL,
   ven_valor double NOT NULL,
   ven_fk_funcionario int NOT NULL,
   ven_fk_carro int NOT NULL,
   PRIMARY KEY (ven_id),
   FOREIGN KEY (ven_fk_funcionario) REFERENCES funcionario (fun_id),
   FOREIGN KEY (ven_fk_carro) REFERENCES carro (car_id)
);


CREATE TABLE itensVend(
    ite_id int NOT NULL AUTO_INCREMENT,
    ite_quantidade int NOT NULL,
    ite_fk_produto int NOT NULL,
    ite_fk_venda int NOT NULL,
    PRIMARY KEY (ite_id),
    FOREIGN KEY (ite_fk_venda) REFERENCES venda (ven_id),
    FOREIGN KEY (ite_fk_produto) REFERENCES produto (pro_id)
);


CREATE TABLE entrega(
    ent_id int NOT NULL AUTO_INCREMENT,
    ent_pessoa varchar(50) NOT NULL,
    ent_logradouro varchar(200) NOT NULL,
    ent_bairro varchar(100) NOT NULL,
    ent_numero varchar(10) NOT NULL,
    ent_cidade varchar(45) NOT NULL,
    ent_cep varchar(9) NOT NULL,
    ent_obs varchar(45),
    ent_status varchar(10) NOT NULL,
    ent_dataEnt date,
    ent_fk_carro int NOT NULL,
    ent_fk_funcionario int NOT NULL,
    PRIMARY KEY (ent_id),
    FOREIGN KEY (ent_fk_carro) REFERENCES carro (car_id),
    FOREIGN KEY (ent_fk_funcionario) REFERENCES funcionario (fun_id)
);


INSERT INTO funcionario (fun_nome, fun_data_nasc, fun_logradouro, fun_bairro, fun_cidade, fun_num_resid, fun_cep, fun_cargo, fun_data_adm, fun_ctps) VALUES ("Administrador", "2015-01-01", "Admin", "Admin", "Admin", "123", "12345-678", "Administrador", "2015-01-01", "75698542");


INSERT INTO login (log_login, log_senha, log_fk_funcionario) VALUES ("Admin", "admin", 1);

