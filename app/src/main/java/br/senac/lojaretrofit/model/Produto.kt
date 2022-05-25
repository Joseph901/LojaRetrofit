package br.senac.lojaretrofit.model

data class Produto(
    var descontoPromocao: Double = 0.0,
    var ativoProduto: Boolean = true,
    var idCategoria: Int = 0,
    var idProduto: Int = 0,
    var descProduto: String = "",
    var precProduto: Double = 0.0,
    var nomeProduto: String = "",
    var qtdMinEstoque: Int = 0
)
