package apps.xenione.com.demoloader.presentation.notes.notedetail;
/*
Copyright 08/04/2017 Eugeni Josep Senent i Gabriel

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/


import apps.xenione.com.demoloader.presentation.BasePresenter;
import apps.xenione.com.demoloader.presentation.BaseView;

public class NoteDetailContract {

    interface View extends BaseView<Presenter> {

        void showUsers(NoteModelView users);

        boolean isActive();
    }

    public interface Presenter extends BasePresenter<View> {

        void fetchUsers(String UUID);

    }
}
