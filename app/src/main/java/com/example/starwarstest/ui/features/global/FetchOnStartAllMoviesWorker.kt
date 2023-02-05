package com.example.starwarstest.ui.features.global

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class FetchOnStartAllMoviesWorker(context: Context, workerParameters: WorkerParameters) :
    CoroutineWorker(context, workerParameters) {

    override suspend fun doWork(): Result = try {
        /*val repository = (applicationContext as ProvidePeriodicRepository).providePeriodicRepository()
        repository.randomNumberFact()*/
        Result.success()
    } catch (e: Exception) {
        Result.retry()
    }
}

interface ProvidePeriodicRepository {
    //fun providePeriodicRepository(): RandomNumberRepository
}