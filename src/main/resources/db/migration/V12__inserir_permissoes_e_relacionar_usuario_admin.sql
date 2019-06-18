INSERT INTO permissao VALUES (1, 'CADASTRAR_CIDADE');
INSERT INTO permissao VALUES (2, 'CADASTRAR_USUARIO');


INSERT INTO grupo_permissao VALUES (1,1);
INSERT INTO grupo_permissao VALUES (1,2);


INSERT INTO usuario_grupo VALUES ((SELECT codigo from usuario WHERE email = 'icjunior07@gmail.com'),1);