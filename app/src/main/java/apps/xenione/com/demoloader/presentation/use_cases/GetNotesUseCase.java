package apps.xenione.com.demoloader.presentation.use_cases;
/*
Copyright 29/04/2017 Eugeni Josep Senent i Gabriel

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

import java.util.List;

import apps.xenione.com.demoloader.data.Note;
import apps.xenione.com.demoloader.data.NoteRepository;

public class GetNotesUseCase extends UseCase<Void,List<Note>> {

    private NoteRepository mRepository;

    public GetNotesUseCase(NoteRepository repository) {
        mRepository = repository;
    }

    @Override
    public List<Note> call() throws Exception {
        return mRepository.getAll();
    }

    @Override
    public GetNotesParamBuilder getParamBuilder() {
        return new GetNotesParamBuilder(this);
    }

    public static class GetNotesParamBuilder extends ParamBuilder<Void> {

        public GetNotesParamBuilder(UseCase<Void, ?> useCase) {
            super(useCase);
        }

        public GetNotesParamBuilder withNothing(){
            return this;
        }

        @Override
        protected Void buildParams() {
            return null;
        }
    }
}
