package com.example.numbersapp.databinding;
import com.example.numbersapp.R;
import com.example.numbersapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNumberBindingImpl extends ItemNumberBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNumberBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemNumberBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.imageViewNumber.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewArabic.setTag(null);
        this.textViewEnglish.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.numberItem == variableId) {
            setNumberItem((com.example.numbersapp.NumberItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNumberItem(@Nullable com.example.numbersapp.NumberItem NumberItem) {
        this.mNumberItem = NumberItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.numberItem);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String numberItemEnglishName = null;
        com.example.numbersapp.NumberItem numberItem = mNumberItem;
        java.lang.String numberItemArabicName = null;
        int numberItemImageResId = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (numberItem != null) {
                    // read numberItem.englishName
                    numberItemEnglishName = numberItem.getEnglishName();
                    // read numberItem.arabicName
                    numberItemArabicName = numberItem.getArabicName();
                    // read numberItem.imageResId
                    numberItemImageResId = numberItem.getImageResId();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.imageViewNumber.setContentDescription(numberItemEnglishName);
            }
            // api target 1

            com.example.numbersapp.BindingAdaptersKt.setImageResource(this.imageViewNumber, numberItemImageResId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewArabic, numberItemArabicName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewEnglish, numberItemEnglishName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): numberItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}