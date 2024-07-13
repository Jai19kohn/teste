-- Create empresa table
CREATE TABLE empresa (
  id long PRIMARY KEY,
  nome_empresa VARCHAR(50),
  missao_empresa TEXT(2500),
  visao_empresa TEXT(2500),
  valores_empresa TEXT(2500),
)

-- Create planos_estrategicos_empresa table
CREATE TABLE planos_estrategicos_empresa (
  id long PRIMARY KEY,
  horizonte_planejamento VARCHAR(20) NOT NULL,
  descricao_plano VARCHAR(100) NOT NULL,
  FOREIGN KEY (id_empresa) REFERENCES empresa (id)
  );

-- Create planos_estrategicos_setor table
CREATE TABLE planos_estrategicos_setor (
  id long PRIMARY KEY,
  nome_setor VARCHAR(50),
  horizonte_planejamento VARCHAR(20) NOT NULL,
  descricao_plano VARCHAR(100) NOT NULL,
  FOREIGN KEY (plano_pai_id) REFERENCES planos_estrategicos_empresa (id)
  );

-- Create perspectivas table
CREATE TABLE perspectivas (
  id long PRIMARY KEY,
  FOREIGN KEY (plano_id) REFERENCES planos_estrategicos_empresa (id),
  FOREIGN KEY (plano_setor_id) REFERENCES planos_estrategicos_setor (id),
  descricao_perspectiva VARCHAR(200),
  objetivos TEXT
);