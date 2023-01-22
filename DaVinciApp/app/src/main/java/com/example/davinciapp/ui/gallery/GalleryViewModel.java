package com.example.davinciapp.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("La virgen con el niño riendo' es obra del genio florentino. La única escultura que Leonardo Da Vinci habría realizado lleva cerca de 50 años a la vista de todos  ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}