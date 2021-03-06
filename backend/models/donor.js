const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const donorSchema = new Schema({
    email: {
        type: String,
        required: true
    },
    password: {
        type: String,
        required: true
    },
    name: {
        type: String,
        required: true
    },
    contactNumber: {
        type: String,
        required: true
    },
    profilePicPath: {
        type: String,
        default: ""
    },
    peopleFed: {
        type: Number,
        default: 0
    },
    moneyRaised: {
        type: Number,
        default: 0
    },
    latitude: {
        type: Number,
        required: true
    },
    longitude: {
        type: Number,
        required: true
    },
    location: {
        type: { type: String },
        coordinates: [Number]
    },
    donationsMade: [{
        type: Schema.Types.ObjectId,
        ref: 'Donation'
    }]
    //ADDITIONAL FIELDS CAN BE ADDED BELOW
});

donorSchema.index({ location: "2dsphere" });


module.exports = mongoose.model('Donor', donorSchema);
