insert into unidades (nome, endereco, cep, bairro)
    values ('Unidade Santa Cruz', 'Avenida Isabel', '23515162', 'Santa Cruz');

insert into unidades (nome, endereco, cep, bairro)
    values ('Unidade Barra da Tijuca', 'Rua Tulipa', '22630350', 'Barra da Tijuca');

insert into unidades (nome, endereco, cep, bairro)
    values ('Unidade Centro', 'Rua Embaixador Régis de Oliveira', '20031030', 'Centro');

insert into unidades (nome, endereco, cep, bairro)
    values ('Unidade Jacarepaguá', 'Caminho Rio Pequeno', '22723780', 'Jacarepaguá');

insert into unidades (nome, endereco, cep, bairro)
    values ('Unidade Bonsucesso', 'Rua da Esperança', '21044050', 'Bonsucesso');

insert into unidades (nome, endereco, cep, bairro)
    values ('Unidade Marechal Hermes', 'Rua Doutor Gonçalves Lima', '21555500', 'Marechal Hermes');


insert into alunos (nome, cpf, email, data_de_inscricao)
    values ('Benedito Kevin Melo', '12984124715', 'bbeneditokevinmelo@inductothermgroup.com.br', '2020-02-05');

insert into alunos (nome, cpf, email, data_de_inscricao)
    values ('Julio Jorge da Conceição', '53712789742', 'juliojorgedaconceicao-80@acramisper.com', '2020-02-05');

insert into alunos (nome, cpf, email, data_de_inscricao)
    values ('Manoel Murilo Lima', '80722719701', 'mmanoelmurilolima@midiasim.com.br', '2020-02-05');

insert into alunos (nome, cpf, email, data_de_inscricao)
    values ('Mariana Liz Cavalcanti', '76918872729', 'mmarianalizcavalcanti@termaqui.com.br', '2020-02-05');


insert into professores (nome, cpf, email, data_de_contratacao)
    values ('Amanda Heloise Regina Ferreira', '21641270721', 'amandaheloisereginaferreira@grupoannaprado.com.br', '2015-12-05');

insert into professores (nome, cpf, email, data_de_contratacao)
    values ('Benedita Nicole Rayssa dos Santos', '66421733760', 'beneditanicolerayssadossantos@performa.com.br', '2015-12-05');


insert into cursos (nome, data_inicio, data_fim, finalizado, unidade_id, professor_id)
    values ('introdução a programação', '2021-02-05', '2021-07-09', false, 1, 1);

insert into cursos (nome, data_inicio, data_fim, finalizado, unidade_id, professor_id)
    values ('algoritmos', '2021-02-05', '2021-07-09', false, 1, 1);

insert into cursos (nome, data_inicio, data_fim, finalizado, unidade_id, professor_id)
    values ('matemática discreta', '2021-02-05', '2021-07-09', false, 1, 2);


insert into matriculas (aprovado, data_de_inscricao, curso_id, aluno_id)
    values (true, '2021-02-05', 1, 1);

insert into matriculas (aprovado, data_de_inscricao, curso_id, aluno_id)
    values (true, '2021-02-05', 1, 2);

insert into matriculas (aprovado, data_de_inscricao, curso_id, aluno_id)
    values (true, '2021-02-05', 1, 3);

insert into matriculas (aprovado, data_de_inscricao, curso_id, aluno_id)
    values (true, '2021-02-05', 1, 4);

