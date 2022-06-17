# Project 3 - *Instagram*

**Instagram** is a photo sharing app using Parse as its backend.

Time spent: **20** hours spent in total

## User Stories

The following **required** functionality is completed:

- [x] User sees app icon in home screen.
- [x] User can sign up to create a new account using Parse authentication
- [x] User can log in to their account
- [x] The current signed in user is persisted across app restarts
- [x] User can log out of their account
- [x] User can take a photo, add a caption, and post it to "Instagram"
- [x] User can view the last 20 posts submitted to "Instagram"
- [x] User can pull to refresh the last 20 posts submitted to "Instagram"
- [x] User can tap a post to go to a Post Details activity, which includes timestamp and caption.

The following **stretch** features are implemented:

- [x] Style the login page to look like the real Instagram login page.
- [ ] Style the feed to look like the real Instagram feed.
- [ ] User can load more posts once they reach the bottom of the feed using endless scrolling.
- [x] User should switch between different tabs using fragments and a Bottom Navigation View.
    - [x] Feed Tab (to view all posts from all users)
    - [x] Capture Tab (to make a new post using the Camera and Photo Gallery)
    - [x] Profile Tab (to view only the current user's posts)
- [ ] Show the username and creation time for each post
- User Profiles:
    - [ ] Allow the logged in user to add a profile photo
    - [ ] Display the profile photo with each post
    - [ ] Tapping on a post's username or profile photo goes to that user's profile page
    - [ ] User Profile shows posts in a grid
- [ ] After the user submits a new post, show an indeterminate progress bar while the post is being uploaded to Parse
- [ ] User can comment on a post and see all comments for each post in the post details screen.
- [ ] User can like a post and see number of likes for each post in the post details screen.

The following **additional** features are implemented:

- [ ] List anything else that you can get done to improve the app functionality!

Please list two areas of the assignment you'd like to **discuss further with your peers** during the next class (examples include better ways to implement something, how to extend your app in certain ways, etc):

1. How to implement the grid in the profile.
2. Learning more about fragments.

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='http://i.imgur.com/link/to/your/gif/file.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [Kap](https://getkap.co/).

## Credits

List an 3rd party libraries, icons, graphics, or other assets you used in your app.

- [Android Async Http Client](http://loopj.com/android-async-http/) - networking library


## Notes

Describe any challenges encountered while building the app.

- INSTALL_FAILED_INSUFFICIENT_STORAGE error -> I had to delete my emulator and create a new one each time this occurred.
- androidx.constraintlayout.widget.ConstraintLayout cannot be cast to android.widget.ImageView -> I was confused since I had no ID for my constraint layout so I was confused as to how I was casting it to a ImageView. However, I simply gave my constraint layout an ID and this seemed to fix the problem. 
- Unable to access Github repository and push “fatal: Could not read from remote repository. Please make sure you have the correct access rights and the repository exists.” -> Removed the “usekeychain yes” in my .ssh config file. I also realized that I had to rebase to the remote origin main because I added a ReadMe file manually from the GitHub UI. I needed to rebase to that commit so I could properly merge because the commit points become in sync again.
- Figuring out how to navigate from a post to an activity with more details using a click -> Needed to add a setOnClickListener to the itemView in the ViewHolder.
- When working on the refresh feature, refreshing would not stop and would add posts again each time I refreshed. -> Forgot to clear out the RecyclerView adapter before adding all the posts back. I also had to add swipeContainer.setRefreshing(false) in order to indicate that the refresh has completed.
- Learning about styling was a challenge but I figured out how to use background images and nice icons.

## License

    Copyright [2022] [Alana Depaz]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
