package com.example.conveyers_model.controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class MainController {

    public Button btnFlowStructure;
    public Button btnRepairProgram;
    public Button btnCharacteristicsOfTemporaryModels;
    public Button btnEquipmentRecoveryTimes;
    public Spinner<Integer> spinnerRepairPositions;
    public Spinner<Integer> spinnerNumberOfTransportModules;
    public CheckBox checkBoxAreaOfPaintingWagons;
    public CheckBox checkBoxWagonPreparationSection;
    public CheckBox chockBoxCarRepairArea;
    public Label labelNumberOfTransportModules;
    public Label labelRepairPositions;
    public TableView tableWagonPreparationSection;
    public TableView tableAreaOfPaintingWagons;
    public TableView tableRepairPositions;
    public TableView tableNumberOfTransportModules;
    public AnchorPane anchorPane1;
    public AnchorPane anchorPane2;
    public AnchorPane anchorPane3;
    public AnchorPane anchorPane4;
    public Spinner<Integer> spinnerModelingStep;
    public Spinner<Integer> spinnerVolumeOfRepairsPerYear;
    public Spinner<Integer> spinnerNumberOfRepairGroups;
    private SpinnerValueFactory<Integer> valueRepairPositions;
    private SpinnerValueFactory<Integer> valueNumberOfTransportModules;
    private SpinnerValueFactory<Integer> valueSpinnerModelingStep;
    private SpinnerValueFactory<Integer> valueSpinnerVolumeOfRepairsPerYear;
    private SpinnerValueFactory<Integer> valueSpinnerNumberOfRepairGroups;

    //public ObservableList<> list = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        initCheckBox();
        initVariables();
        spinnerRepairPositions.setValueFactory(valueRepairPositions);
        spinnerNumberOfTransportModules.setValueFactory(valueNumberOfTransportModules);
        spinnerNumberOfRepairGroups.setValueFactory(valueSpinnerNumberOfRepairGroups);
        spinnerVolumeOfRepairsPerYear.setValueFactory(valueSpinnerVolumeOfRepairsPerYear);
        spinnerModelingStep.setValueFactory(valueSpinnerModelingStep);
    }

    private void initVariables() {
        valueRepairPositions = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 6);
        valueNumberOfTransportModules = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 2);
        valueSpinnerModelingStep =  new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 60, 60);
        valueSpinnerVolumeOfRepairsPerYear =  new SpinnerValueFactory.IntegerSpinnerValueFactory(100, 10000, 10000);
        valueSpinnerNumberOfRepairGroups =  new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
    }

    private void initCheckBox() {
        chockBoxCarRepairArea.setSelected(true);
        checkBoxWagonPreparationSection.setSelected(false);
        checkBoxAreaOfPaintingWagons.setSelected(false);
        handleOptionWagonPreparationSection();
        handleOptionAreaOfPaintingWagons();
    }

    public void handleOptionWagonPreparationSection() {
        if (checkBoxWagonPreparationSection.isSelected())
            tableWagonPreparationSection.setDisable(false);
        else
            tableWagonPreparationSection.setDisable(true);
    }

    public void handleOptionAreaOfPaintingWagons() {
        if (checkBoxAreaOfPaintingWagons.isSelected())
            tableAreaOfPaintingWagons.setDisable(false);
        else
            tableAreaOfPaintingWagons.setDisable(true);
    }

    public void handleOptionCarRepairArea() {
        if (chockBoxCarRepairArea.isSelected()) {
            labelRepairPositions.setDisable(false);
            labelNumberOfTransportModules.setDisable(false);
            spinnerRepairPositions.setDisable(false);
            spinnerNumberOfTransportModules.setDisable(false);
            tableRepairPositions.setDisable(false);
            tableNumberOfTransportModules.setDisable(false);
        } else {
            labelRepairPositions.setDisable(true);
            labelNumberOfTransportModules.setDisable(true);
            spinnerRepairPositions.setDisable(true);
            spinnerNumberOfTransportModules.setDisable(true);
            tableRepairPositions.setDisable(true);
            tableNumberOfTransportModules.setDisable(true);
        }
    }

    private void initDefaultBackgroundButton() {
        btnFlowStructure.setStyle("-fx-background-color: #3C3F41;");
        btnRepairProgram.setStyle("-fx-background-color: #3C3F41;");
        btnCharacteristicsOfTemporaryModels.setStyle("-fx-background-color: #3C3F41;");
        btnEquipmentRecoveryTimes.setStyle("-fx-background-color: #3C3F41;");
    }

    private void initDefaultVisiblePane() {
        anchorPane1.setVisible(false);
        anchorPane2.setVisible(false);
        anchorPane3.setVisible(false);
        anchorPane4.setVisible(false);
    }
    public void actionFlowStructure(ActionEvent actionEvent) {
        initDefaultBackgroundButton();
        initDefaultVisiblePane();
        btnFlowStructure.setStyle("-fx-background-color: #4B6EAF;");
        anchorPane1.setVisible(true);
    }

    public void actionRepairProgram(ActionEvent actionEvent) {
        initDefaultBackgroundButton();
        initDefaultVisiblePane();
        btnRepairProgram.setStyle("-fx-background-color: #4B6EAF;");
        anchorPane2.setVisible(true);
    }

    public void actionCharacteristicsOfTemporaryModels(ActionEvent actionEvent) {
        initDefaultBackgroundButton();
        initDefaultVisiblePane();
        btnCharacteristicsOfTemporaryModels.setStyle("-fx-background-color: #4B6EAF;");
        anchorPane3.setVisible(true);
    }

    public void actionEquipmentRecoveryTimes(ActionEvent actionEvent) {
        initDefaultBackgroundButton();
        initDefaultVisiblePane();
        btnEquipmentRecoveryTimes.setStyle("-fx-background-color: #4B6EAF;");
        anchorPane4.setVisible(true);
    }
}