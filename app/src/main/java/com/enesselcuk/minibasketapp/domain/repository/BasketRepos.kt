package com.enesselcuk.minibasketapp.domain.repository

import com.enesselcuk.minibasketapp.source.local.BasketEntity
import com.enesselcuk.minibasketapp.source.remote.model.BasketResponse
import com.enesselcuk.minibasketapp.util.NetworkResult
import kotlinx.coroutines.flow.Flow

interface BasketRepos {
    suspend fun getProduct(
    ): Flow<NetworkResult<BasketResponse>>
}