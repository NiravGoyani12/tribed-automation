package com.tribed.step_def.myProfile;

import com.tribed.pages.myProfile.EditTileImagePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.awt.*;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EditTileImageSteps {

    EditTileImagePage editTileImagePage =new EditTileImagePage();
    List<Map<String, String>> data;


    @Then("^culture window should be close$")
    public void cultureWindowShouldBeClose() {
        assertThat(editTileImagePage.isCultureScreenOpen(), is(false));
    }
}
