/*
 * Copyright (c) 2016. Alejandro Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package es.asy.patterns.creational.builder;

/**
 * Entity that represents a "Car".
 *
 * @author asanchezyu@gmail.com
 * @version 1.0.
 * @since 8/4/16.
 */
public class Car {

    private final String plateNumber;
    private final String ownerDrivingLicenseId;
    private final String colour;
    private final String type;
    private final String year;

    private Car(Builder builder) {
        this.plateNumber = builder.plateNumber;
        this.ownerDrivingLicenseId = builder.ownerDrivingLicenseId;
        this.colour = builder.colour;
        this.type = builder.type;
        this.year = builder.year;
    }

    public String getColour() {
        return colour;
    }

    public String getOwnerDrivingLicenseId() {
        return ownerDrivingLicenseId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getType() {
        return type;
    }

    public String getYear() {
        return year;
    }

    /**
     * Builder class.
     */
    public static class Builder {

        private final String plateNumber;
        private final String ownerDrivingLicenseId;
        private String colour;
        private String type;
        private String year;

        public Builder(String plateNumber, String ownerDrivingLicenseId) {
            this.plateNumber = plateNumber;
            this.ownerDrivingLicenseId = ownerDrivingLicenseId;
        }

        public Builder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setYear(String year) {
            this.year = year;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}