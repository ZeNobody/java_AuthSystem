SELECT
tbU.idUsuario,
tbU.idPermissao,
tbU.nomeUsuario,
tbU.nuCpf,
tbU.email,
tbU.telefone,
tbU.ativo,
tbU.dtInclusao
FROM tbUsuario tbU
JOIN tbPermissao tbP on tbP.idPermissao = tbU.idPermissao
WHERE tbU.nuCpf = :cpf;