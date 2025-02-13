package com.nexters.android.pliary.view.detail

import androidx.lifecycle.ViewModel
import com.nexters.android.pliary.di.annotation.FragmentScope
import com.nexters.android.pliary.di.annotation.ViewModelKey
import com.nexters.android.pliary.view.detail.bottom.viewmodel.DetailDiaryViewModel
import com.nexters.android.pliary.view.detail.bottom.adapter.DetailDiaryAdapter
import com.nexters.android.pliary.view.detail.bottom.viewmodel.DetailCalendarViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module(includes = [DetailFragmentModule.ProvideModule::class])
internal interface DetailFragmentModule {

    @Module
    class ProvideModule {
        @Provides
        @FragmentScope
        fun provideDiaryAdapter(): DetailDiaryAdapter {
            return DetailDiaryAdapter()
        }
    }

    @Binds
    @FragmentScope
    @IntoMap
    @ViewModelKey(DetailViewModel::class)
    fun bindDetailViewModel(detailViewModel: DetailViewModel): ViewModel

    @Binds
    @FragmentScope
    @IntoMap
    @ViewModelKey(DetailDiaryViewModel::class)
    fun bindDetailDiaryViewModel(detailDiaryViewModel: DetailDiaryViewModel): ViewModel


    @Binds
    @FragmentScope
    @IntoMap
    @ViewModelKey(DetailCalendarViewModel::class)
    fun bindDetailCalendarViewModel(detailCalendarViewModel: DetailCalendarViewModel): ViewModel
}