package com.campus.diary.mvp.contract;

import com.campus.diary.model.CircleItem;
import com.campus.diary.model.CommentConfig;
import com.campus.diary.model.CommentItem;
import com.campus.diary.model.FavorItem;

import java.util.List;

public interface CircleContract {

    interface View extends BaseView {
        void update2DeleteCircle(String circleId);

        void update2AddFavor(int circlePosition, FavorItem addItem);

        void update2DeleteFavor(int circlePosition, String favortId);

        void update2AddComment(int circlePosition, CommentItem addItem);

        void update2DeleteComment(int circlePosition, String commentId);

        void updateEditTextBodyVisible(int visibility, CommentConfig commentConfig);

        void update2loadData(int loadType, List<CircleItem> datas);
    }

    interface Presenter {
        void loadData(int loadType);

        void deleteCircle(final String circleId);

        void addFavor(final int circlePosition, final String circleId);

        void deleteFavor(final int circlePosition, final String favortId);

        void addComment(String content, final CommentConfig config);

        void deleteComment(final int circlePosition, final String commentId);

        void showEditTextBody(CommentConfig commentConfig);
    }
}
