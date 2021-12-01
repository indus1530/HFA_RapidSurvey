package edu.aku.hassannaqvi.hfa_rapidsurvey.base.usecase

import edu.aku.hassannaqvi.hfa_rapidsurvey.base.repository.GeneralRepository

class LoginUsecase(val repository: GeneralRepository) {
    suspend operator fun invoke(
        username: String, password: String
    ) = repository.getLoginInformation(
        username, password
    )
}