package dev.pinkroom.walletconnectkit.data.wallet

import org.walletconnect.Session

interface WalletManager {
    fun openWallet()
    fun requestHandshake()

    suspend fun performTransaction(
        address: String,
        value: String,
        data: String?,
        nonce: String? = null,
        gasPrice: String? = null,
        gasLimit: String? = null,
    ): Session.MethodCall.Response

    suspend fun performTransaction(
        address: String,
        value: String,
        nonce: String? = null,
        gasPrice: String? = null,
        gasLimit: String? = null,
    ): Session.MethodCall.Response

    suspend fun personalSign(message: String): Session.MethodCall.Response
}