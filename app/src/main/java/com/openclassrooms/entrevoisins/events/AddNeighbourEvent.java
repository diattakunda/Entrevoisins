package com.openclassrooms.entrevoisins.events;

import com.openclassrooms.entrevoisins.model.Neighbour;


    /**
     * Event fired when a user add a Neighbour
     */
    public class AddNeighbourEvent {

        /**
         * Neighbour to add
         */
        public Neighbour neighbour;
        public int position;

        /**
         * Constructor.
         * @param neighbour
         */
        public AddNeighbourEvent(Neighbour neighbour, int position) {
            this.neighbour = neighbour;
            this.position = position;
        }
    }


