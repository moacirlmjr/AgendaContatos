create database agendaContatos;

CREATE SEQUENCE contato_id_seq;
CREATE TABLE contato
(
   id integer NOT NULL DEFAULT nextval('contato_id_seq'), 
   "dataCriacao" timestamp without time zone, 
   "dataAtualizacao" timestamp without time zone, 
   nome character varying, 
   telefone character varying, 
   cpf character varying, 
   rg character varying, 
   "orgaoExp" character varying, 
   email character varying
);
ALTER SEQUENCE contato_id_seq OWNED BY contato.id;

