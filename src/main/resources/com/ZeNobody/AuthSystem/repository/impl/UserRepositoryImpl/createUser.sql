INSERT INTO TbUsuario (
    nomeUsuario,
    nuCpf,
    email,
    telefone,
    senha,
    ativo,
    dtInclusao,
    idPermissao
) VALUES (
    :nomeUsuario,
    :nuCpf,
    :email,
    :telefone,
    :senha,
    :ativo,
    :dtInclusao,
    :permissaoEnum.value
);